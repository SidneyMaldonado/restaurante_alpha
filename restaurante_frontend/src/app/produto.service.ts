import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Produto } from 'src/Produto';

@Injectable({
  providedIn: 'root'
})
export class ProdutoService {

  constructor(private _produto:HttpClient) { }

  ListarProduto():Observable<any>{
    return this._produto.get<Produto[]>("http://localhost:8080/produto/listar")
  }

  IncluirProduto(produto: Produto): Observable<any>{
    return this._produto.post<Produto[]>("http://localhost:8080/produto/incluir", produto)
  }
}
