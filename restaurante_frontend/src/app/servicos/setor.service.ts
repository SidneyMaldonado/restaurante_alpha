import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Setor } from 'src/entidades/Setor';

@Injectable({
  providedIn: 'root'
})
export class SetorService {

  constructor( private servico:HttpClient) { }

  ListarSetor():Observable<any>{
    return this.servico.get<Setor[]>("http://localhost:8085/setor/listar")

  }
}
