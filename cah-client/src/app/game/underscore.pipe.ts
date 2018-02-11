import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'underscore'
})
export class UnderscorePipe implements PipeTransform {

  transform(value: string, args?: any): any {
    return value.replace(/_+/g, '__________');
  }

}
