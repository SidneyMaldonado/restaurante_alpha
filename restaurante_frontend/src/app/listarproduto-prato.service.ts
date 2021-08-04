import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ListarProdutoPrato } from 'src/entidades/ListarProdutoPrato';

@Injectable({
  providedIn: 'root'
})
export class ListarprodutoPratoService {


  constructor(private _http:HttpClient) { }

  listarprodutoprato():Observable<any>{

    return this._http.get<ListarProdutoPrato>("http://localhost:8080/views/listarprodutospratos");
  }
}






 