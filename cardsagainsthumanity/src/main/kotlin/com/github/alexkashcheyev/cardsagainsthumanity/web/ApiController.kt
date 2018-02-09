package com.github.alexkashcheyev.cardsagainsthumanity.web

import com.github.alexkashcheyev.cardsagainsthumanity.service.GameService
import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletResponse
import javax.validation.constraints.Null

@RestController
class ApiController(private val gameService: GameService) {

    @GetMapping("/api/client")
    fun getClientState(
            @RequestParam("game") gameId: Long,
            @RequestParam("player") playerId: Long
    ): ClientState {
        return gameService.getClientState(gameId, playerId)
    }

    @GetMapping("/api/monitor")
    fun getMonitorState(
            @RequestParam("game") gameId: Long
    ): MonitorState {
        return gameService.getMonitorState(gameId)
    }

    @PostMapping("/api/creategame")
    fun createGame(): MonitorState {
        val gameId = gameService.createGame()

        return gameService.getMonitorState(gameId)
    }

    @PostMapping("/api/joingame")
    fun joinGame(
            @RequestParam("game") gameId: Long,
            @RequestParam("name") name: String,
            response: HttpServletResponse
    ): ClientState? {
        val playerId = gameService.joinGame(gameId, name)

        if (playerId < 0) {
            response.status = HttpServletResponse.SC_CONFLICT
            return null
        } else {
            return gameService.getClientState(gameId, playerId)
        }
    }

    @PostMapping("/api/startgame")
    fun startGame(
            @RequestParam("game") gameId: Long,
            @RequestParam("player") playerId: Long,
            response: HttpServletResponse
    ) {
        try {
            gameService.startGame(gameId, playerId)
        } catch (ex: IllegalArgumentException) {
            response.status = HttpServletResponse.SC_FORBIDDEN
        }
    }

    @PostMapping("/api/sendcards")
    fun sendCards(
            @RequestParam("game") gameId: Long,
            @RequestParam("player") playerId: Long,
            @RequestParam("card[]") cardIds: Array<Long>,
            response: HttpServletResponse
    ) {
        try {
            gameService.sendCards(gameId, playerId, cardIds)
        } catch (ex: NullPointerException) {
            response.status = HttpServletResponse.SC_NOT_FOUND
        }
    }

    @PostMapping("/api/choosewinner")
    fun chooseWinner(
            @RequestParam("game") gameId: Long,
            @RequestParam("player") playerId: Long,
            @RequestParam("winner") winnerId: Long,
            response: HttpServletResponse
    ) {
        try {
            gameService.chooseWinner(gameId, playerId, winnerId)
        } catch (ex: IllegalArgumentException) {
            response.status = HttpServletResponse.SC_FORBIDDEN
        } catch (ex: NullPointerException) {
            response.status = HttpServletResponse.SC_NOT_FOUND
        }
    }
}