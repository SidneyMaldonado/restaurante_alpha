import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ListarClienteOrdemAlfabetica } from 'src/entidades/ListarClienteOrdemAlfabetica';

@Injectable({
  providedIn: 'root'
})
export class ListarclienteordemalfabeticaService {

  constructor(private _http:HttpClient) { }
 listarclienteordemalfabetica():Observable<any>{

    return this._http.get<ListarClienteOrdemAlfabetica[]>("http://localhost:8080/views/ListarClientesOrdemAlfabetica")

 }
}




 