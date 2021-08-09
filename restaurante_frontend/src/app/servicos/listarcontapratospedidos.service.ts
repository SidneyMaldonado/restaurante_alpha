import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ViewContaPratosPedidos } from 'src/entidades/ViewContaPratosPedidos';

@Injectable({
  providedIn: 'root'
})
export class ListarcontapratospedidosService {

  constructor( private _http:HttpClient) { }

  listarContaPratoPedidos(): Observable<any>{

    return this._http.get<ViewContaPratosPedidos>("http://localhost:8085/views/listarContaPratoPedidos");
  }
}
