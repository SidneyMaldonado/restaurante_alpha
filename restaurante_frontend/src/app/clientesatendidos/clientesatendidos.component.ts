import { Component, OnInit } from '@angular/core';
import { ListarClientesAtendidos } from 'src/entidades/ListarClientesAtendidos';
import { ClientesatendidosService } from '../servicos/clientesatendidos.service';

@Component({
  selector: 'app-clientesatendidos',
  templateUrl: './clientesatendidos.component.html',
  styleUrls: ['./clientesatendidos.component.css']
})
export class ClientesatendidosComponent implements OnInit {


  public ClientesAtendidos :ListarClientesAtendidos[] = [];

  constructor( private service: ClientesatendidosService) { }

  ngOnInit(): void {

    this.service.listarClientesAtendidos().subscribe(
      dados => this.ClientesAtendidos = dados,
      error => alert("Erro ao recuperar dados")
    )
  }

}
