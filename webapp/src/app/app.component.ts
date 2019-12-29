import { Component } from '@angular/core';

@Component({
  selector: 'sma-root',
  template: `
    <div class="container mt-5" [hidden]="mainOutlet.isActivated">
      <div class="jumbotron">
        <h1 class="display-4">👋 Sistema Multiagente para la Gestión de Facebook</h1>
        <p class="lead">
          El sistema que se plantea desarrollar son dos comunidades de agentes, uno web y otro en un
          servidor web, los cuales se describen a continuación.
        </p>
        <p>
          <b>Web Server Community</b> contiene todos los recursos que se van a necesitar para
          consumir el API de Facebook y dar el servicio de búsqueda al Web Client. Un agente,
          Facebook Bot contiene los métodos para consumir post, tags, grupos, noticias, etc; del API
          de Facebook. Otro agente, es el Pipeline Bot este agente se encarga de la transformación
          de datos obtenidos por Facebook Bot. Los agrupa, cuenta, filtra y clasifica la información
          para devolverla al Web Client.
        </p>
        <p>
          <b>Web Client Community</b> es un agente que funciona en la web, el Web Bot, el cual toma
          las palabras clave que el usuario ingresa, las separa, filtra y realiza la petición al Web
          Server. También se encarga de esperar la respuesta del servidor y mostrar los resultados
          obtenidos.
        </p>

        <hr class="my-4" />

        <h5>GRUPO DE TRABAJO:</h5>
        <ul>
          <li>Kelvin Ricardo Arrobo Castillo</li>
          <li>Bruno Alexander Esparza Carchi</li>
          <li>Jorge Alcivar Hurtado Duarte</li>
          <li>Jonathan Andres Rosero Soto</li>
        </ul>

        <a class="btn btn-primary btn-lg" [routerLink]="['/search']" role="button"
          >Ir al buscador 👉</a
        >
      </div>
    </div>

    <router-outlet #mainOutlet="outlet"></router-outlet>
  `,
})
export class AppComponent {}
