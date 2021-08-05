import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { ListarClientesAtendidos } from 'src/entidades/ListarClientesAtendidos';

@Injectable({
  providedIn: 'root'
})
export class ClientesatendidosService {

  constructor(private cliente :HttpClient) { }
  
  listarClientesAtendidos(): Observable<any>{
    return this.cliente.get<ListarClientesAtendidos[]>("http://localhost:8080/views/listarClientesAtendidos")
  }
}






