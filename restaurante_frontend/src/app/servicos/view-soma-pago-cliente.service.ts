import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ViewSomaPagoCliente } from 'src/entidades/ViewSomaPagoCliente';

@Injectable({
  providedIn: 'root'
})
export class ViewSomaPagoClienteService {

  constructor( private http: HttpClient) { }

  listarSomaPagoCliente(): Observable<any> {
    return this.http.get<ViewSomaPagoCliente>("http://localhost:8080/views/listarSomaPagoCliente");
  }


}
