import { compileClassMetadata } from '@angular/compiler';
import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddclienteComponent } from './addcliente/addcliente.component';
import { AddpagamentoComponent } from './addpagamento/addpagamento.component';
import { AutenticacaoComponent } from './autenticacao/autenticacao.component';
import { IncluirPratosComponent } from './incluir-pratos/incluir-pratos.component';
import { IncluirProdutoComponent } from './incluir-produto/incluir-produto.component';
import { ListaprodutoprecoComponent } from './listaprodutopreco/listaprodutopreco.component';
import { ListarContaPratosPedidosComponent } from './listar-conta-pratos-pedidos/listar-conta-pratos-pedidos.component';
import { ListarFaturamentoComponent } from './listar-faturamento/listar-faturamento.component';
import { ListarPratosIncluirPedidosComponent } from './listar-pratos-incluir-pedidos/listar-pratos-incluir-pedidos.component';
import { ListarProdutoComponent } from './listar-produto/listar-produto.component';
import { ListarProdutosOrdemAlfaComponent } from './listar-produtos-ordem-alfa/listar-produtos-ordem-alfa.component';
import { ListarSomaPagoClienteComponent } from './listar-soma-pago-cliente/listar-soma-pago-cliente.component';
import { ListarcontapratospedidosService } from './listarcontapratospedidos.service';
import { ListarpratoprontoComponent } from './listarpratopronto/listarpratopronto.component';
import { PrincipalComponent } from './principal/principal.component';
import { ViewQtdPratosPedidoComponent } from './view-qtd-pratos-pedido/view-qtd-pratos-pedido.component';



const routes: Routes = [
{path: '', component: PrincipalComponent},
{path: 'addcliente', component: AddclienteComponent},
{path: 'addpagamento', component: AddpagamentoComponent},
{path: 'listarpratopronto', component: ListarpratoprontoComponent},
{path:'listarfaturamento', component:ListarFaturamentoComponent},
{path:'listarpratosincluirpedidos', component:ListarPratosIncluirPedidosComponent},
{path: "login", component: AutenticacaoComponent},
{path:'incluirpratos', component:IncluirPratosComponent},
{path:'incluirproduto', component:IncluirProdutoComponent},
{path:'listarproduto', component:ListarProdutoComponent},
{path:'listasomapagocliente', component: ListarSomaPagoClienteComponent},
<<<<<<< HEAD
{path :'listacontapratopedido', component: ListarContaPratosPedidosComponent},
{path :'listaprodutopreco', component: ListaprodutoprecoComponent}
=======
{path: 'qtdpratospedido', component: ViewQtdPratosPedidoComponent},
{path: 'listaprodutosordemalfa', component: ListarProdutosOrdemAlfaComponent}
>>>>>>> fb72318d83c5ee2479d32f01a6246d4bbeeb6fd9



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
