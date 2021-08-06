import { Component, OnInit } from '@angular/core';
import { ListarProdutoPrato } from 'src/entidades/ListarProdutoPrato';
import { ListarprodutoPratoService } from '../servicos/listarproduto-prato.service';

@Component({
  selector: 'app-listarprodutoprato',
  templateUrl: './listarprodutoprato.component.html',
  styleUrls: ['./listarprodutoprato.component.css']
})
export class ListarprodutopratoComponent implements OnInit {

 listarprodutopratos: ListarProdutoPrato[] = [];
  constructor( private servico: ListarprodutoPratoService) { }

  ngOnInit(): void {
    this.servico.listarprodutoprato().subscribe(

      dados => { this.listarprodutopratos = dados},
      error => alert("Erro ao Listar Produto!!")
    )
    }

}
