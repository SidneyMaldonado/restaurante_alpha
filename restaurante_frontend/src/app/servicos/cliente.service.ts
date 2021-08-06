import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Cliente } from 'src/entidades/Cliente';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  constructor( private _http:HttpClient) { }

  Listar(): Observable<any>{
    return this._http.get<Cliente[]>("http://localhost:8080/cliente/listar");
  }


}
