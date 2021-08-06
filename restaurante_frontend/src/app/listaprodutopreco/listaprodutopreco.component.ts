import { Component, OnInit } from '@angular/core';
import { ViewListaProdutoPreco } from 'src/entidades/ViewListaProdutoPreco';
import { ListaprodutoprecoService } from '../servicos/listaprodutopreco.service';


@Component({
  selector: 'app-listaprodutopreco',
  templateUrl: './listaprodutopreco.component.html',
  styleUrls: ['./listaprodutopreco.component.css']
})
export class ListaprodutoprecoComponent implements OnInit {


  public viewListaProdutoPreco: ViewListaProdutoPreco[] = [];

  constructor( private service: ListaprodutoprecoService) { }

  ngOnInit(): void {

    this.service.listarProdutoPreco().subscribe(
      dados => this.viewListaProdutoPreco = dados,
      error => console.log("Erro ao recuperar dados")
    )
  }

}
