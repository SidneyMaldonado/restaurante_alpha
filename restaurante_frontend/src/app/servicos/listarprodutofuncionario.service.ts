import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ListarProdutoFuncionario } from 'src/entidades/ListarProdutoFuncionario';

@Injectable({
  providedIn: 'root'
})
export class ListarprodutofuncionarioService {

  constructor(private _http:HttpClient) { }

  listarprodutofuncionario():Observable<any>{

    return this._http.get<ListarProdutoFuncionario[]>("http://localhost:8085/views/listarprodutofuncionario");

  }
}
