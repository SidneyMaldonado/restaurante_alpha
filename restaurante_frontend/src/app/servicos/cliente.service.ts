import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Cliente } from 'src/entidades/Cliente';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  private enderecoServidor: string = "http://localhost:8085/";

  constructor( private _http:HttpClient) { }

  Listar(): Observable<any>{
    return this._http.get<Cliente[]>( this.enderecoServidor + "cliente/listar");
  }


}
