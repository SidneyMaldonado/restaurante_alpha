import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ViewQtdPratosPedido } from 'src/entidades/ViewQtdPratosPedido';


@Injectable({
  providedIn: 'root'
})
export class ViewQtdPratosPedidoService {

  constructor( private http: HttpClient) { }

  listarTotalPratosPedido(): Observable<any>{
    return this.http.get<ViewQtdPratosPedido>("http://localhost:8080/views/totalpratospedido");
  }
}
