import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ViewListaProdutoPreco } from 'src/entidades/ViewListaProdutoPreco';



@Injectable({
  providedIn: 'root'
})
export class ListaprodutoprecoService {

  constructor( private _http:HttpClient) { }

  listarProdutoPreco(): Observable<any>{
    
    return this._http.get<ViewListaProdutoPreco>("http://localhost:8085/views/listarProdutoPreco");
  }


}
