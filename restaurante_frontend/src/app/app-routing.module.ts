import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddclienteComponent } from './addcliente/addcliente.component';
import { AddpagamentoComponent } from './addpagamento/addpagamento.component';
import { AutenticacaoComponent } from './autenticacao/autenticacao.component';
import { ClientesatendidosComponent } from './clientesatendidos/clientesatendidos.component';
import { IncluirPratosComponent } from './incluir-pratos/incluir-pratos.component';
import { IncluirProdutoComponent } from './incluir-produto/incluir-produto.component';
import { IncluirfuncionarioComponent } from './incluirfuncionario/incluirfuncionario.component';
import { ListaprodutoprecoComponent } from './listaprodutopreco/listaprodutopreco.component';
import { ListarContaPratosPedidosComponent } from './listar-conta-pratos-pedidos/listar-conta-pratos-pedidos.component';
import { ListarFaturamentoComponent } from './listar-faturamento/listar-faturamento.component';
import { ListarPratosIncluirPedidosComponent } from './listar-pratos-incluir-pedidos/listar-pratos-incluir-pedidos.component';
import { ListarProdutoComponent } from './listar-produto/listar-produto.component';
import { ListarProdutosOrdemAlfaComponent } from './listar-produtos-ordem-alfa/listar-produtos-ordem-alfa.component';
import { ListarSomaPagoClienteComponent } from './listar-soma-pago-cliente/listar-soma-pago-cliente.component';
import { ListarclienteordemalfabeticaComponent } from './listarclienteordemalfabetica/listarclienteordemalfabetica.component';
import { ListarfuncionarioComponent } from './listarfuncionario/listarfuncionario.component';
import { ListarpratoprontoComponent } from './listarpratopronto/listarpratopronto.component';
import { ListarprodfuncionarioComponent } from './listarprodfuncionario/listarprodfuncionario.component';
import { ListarprodutopratoComponent } from './listarprodutoprato/listarprodutoprato.component';
import { ListarsetorComponent } from './listarsetor/listarsetor.component';
import { PrincipalComponent } from './principal/principal.component';
import { ViewQtdPratosPedidoComponent } from './view-qtd-pratos-pedido/view-qtd-pratos-pedido.component';

const routes: Routes = [
{path:'', component: PrincipalComponent},
{path:'addcliente', component: AddclienteComponent},
{path:'addpagamento', component: AddpagamentoComponent},
{path:'listarpratopronto', component: ListarpratoprontoComponent},
{path:'listarfaturamento', component:ListarFaturamentoComponent},
{path:'listarpratosincluirpedidos', component:ListarPratosIncluirPedidosComponent},
{path:'login', component: AutenticacaoComponent},
{path:'incluirpratos', component:IncluirPratosComponent},
{path:'incluirproduto', component:IncluirProdutoComponent},
{path:'listarproduto', component:ListarProdutoComponent},
{path:'listasomapagocliente', component: ListarSomaPagoClienteComponent},
{path:'listarcontapratospedidos', component: ListarContaPratosPedidosComponent},
{path:'listaprodutopreco', component: ListaprodutoprecoComponent},
{path:'qtdpratospedido', component: ViewQtdPratosPedidoComponent},
{path:'listaprodutosordemalfa', component: ListarProdutosOrdemAlfaComponent},
{path:'listarclienteordemalfabetica', component: ListarclienteordemalfabeticaComponent},
{path:'listarprodutoprato', component: ListarprodutopratoComponent},
{path:'listaprodutosordemalfa', component: ListarProdutosOrdemAlfaComponent},
<<<<<<< HEAD
{path:'listaprodutosordemalfa', component: ListarProdutosOrdemAlfaComponent},
{path:'listarfuncionario', component:  ListarfuncionarioComponent},
{path:'incluirfuncionario', component: IncluirfuncionarioComponent},
{path:'listarprodutofuncionario', component: ListarprodfuncionarioComponent}, 
{path:'listarclientesatendidos', component:ClientesatendidosComponent },
{path:'listasetor', component: ListarsetorComponent}
=======
{path: 'listarfuncionario', component:  ListarfuncionarioComponent},
{path: 'incluirfuncionario', component: IncluirfuncionarioComponent},
{path:'listarprodutofuncionario', component: ListarprodfuncionarioComponent}, 
{path:'listarclientesatendidos', component:ClientesatendidosComponent },
{path: 'listasetor', component: ListarsetorComponent},
<<<<<<< HEAD
{path: 'clientesatendidos', component: ClientesatendidosComponent}
=======
{path: 'listapratoporpedido', component: ViewQtdPratosPedidoComponent}
>>>>>>> 99fb563a22eb201808e3dbaa5cb8590b2f51360d
 
>>>>>>> 7e715afb383c2196ab5c0352f622bd8bf4acc425
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
