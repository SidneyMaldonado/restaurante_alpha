import { createTokenForExternalReference } from '@angular/compiler/src/identifiers';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ServicologinService } from '../servicologin.service';
import { Autorizar } from './Autorizar';
import { Login } from './Login';
import { Router } from '@angular/router';
import { Cliente } from 'src/Cliente';
import { ClienteService } from '../cliente.service';

@Component({
  selector: 'app-autenticacao',
  templateUrl: './autenticacao.component.html',
  styleUrls: ['./autenticacao.component.css']
})
export class AutenticacaoComponent implements OnInit {


  clientes: Cliente[] = [];
  login: Login = {codCliente:'', senha:''}
  autorizado: Autorizar = { autorizado: false }
  private router;
  
  constructor( private servico: ServicologinService, 
               router: Router,
               private servicocliente: ClienteService) { this.router = router; }
 
  ngOnInit(): void {
    this.servicocliente.Listar().subscribe(
      dados => {this.clientes = dados, console.log(this.clientes)}, 
      error => console.log("Erro ao recuperar clientes")
      
    )
  }

  public autenticar(frm: NgForm){

    // executar o processo de login logar

    this.servico.fazerLogin(this.login).subscribe(

      dados => {this.autorizado = dados, console.log(this.autorizado.autorizado), this.navegar()},
      error => console.log("Erro ao autorizar")
       
    )

  }

  public navegar(){
    // se a senha estiver correta
    if (this.autorizado.autorizado){
      // redirecionar para o componente principal
 
       this.router.navigate([]);
        
 
      alert("Acesso Autorizado!")
       this.router.navigate([""]);
 

    } else {
       alert('Acesso não autorizado');
    }

  }


}
