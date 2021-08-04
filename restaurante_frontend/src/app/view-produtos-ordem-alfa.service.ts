import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ViewProdutosAlfa } from 'src/entidades/ViewProdutosAlfa';

@Injectable({
  providedIn: 'root'
})
export class ViewProdutosOrdemAlfaService {

  constructor(private http: HttpClient) { }

  listarProdutosAlfa(): Observable<any>{
    return this.http.get<ViewProdutosAlfa>("http://localhost:8080/views/produtosordemalfabetica");
  }
}
