import { Component, OnInit } from '@angular/core';
import { Produto } from 'src/Produto';
import { ProdutoService } from '../produto.service';

@Component({
  selector: 'app-listar-produto',
  templateUrl: './listar-produto.component.html',
  styleUrls: ['./listar-produto.component.css']
})
export class ListarProdutoComponent implements OnInit {

  produto: Produto[]=[];

  constructor(private servicolistarproduto:ProdutoService) { }

  ngOnInit(): void {
  this.servicolistarproduto.ListarProduto().subscribe(
    dados=>{this.produto= dados, console.log(dados)},
    error=> console.log("Erro ao buscar dados")
  )
  }


}
