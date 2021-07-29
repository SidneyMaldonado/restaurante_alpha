import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Funcionario } from 'src/Funcionario';

@Injectable({
  providedIn: 'root'
})
export class FuncionarioService {

  constructor( private _http:HttpClient) { }

  listarfuncionario(): Observable<any>{
    return this._http.get<Funcionario[]>("http://localhost:8080/funcionarios/listar")
  }

  incluirfuncionario(funcionario:Funcionario): Observable<any>{
    return this._http.post<Funcionario>("http://localhost:8080/funcionarios/incluir",funcionario);
  }
}
