import {Component} from '@angular/core';

@Component({
  selector: 'app-root', // para por llamar al contenido dentro del  app.component.html se debe hacer uso del tag <app-root>
  templateUrl: './app.component.html',// cuando se usa el tag <app-root> se muetra el contendo de este archivo.
  styleUrls: ['./app.component.css'] // se puede aplicar CSS exclusivo para cada componente.
})
export class AppComponent {
  // No hay lódica que implementar en este componente.
}
