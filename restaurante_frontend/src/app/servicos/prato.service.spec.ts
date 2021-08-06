import { TestBed } from '@angular/core/testing';
import { PratoService } from './prato.service';
import { HttpClientTestingModule} from '@angular/common/http/testing'
import { Prato } from '../listar-pratos-incluir-pedidos/Prato';


describe('PratoService', () => {
  let service: PratoService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports:[HttpClientTestingModule]
    });
    service = TestBed.inject(PratoService);
  });

  it('should be created', ()  => {
    expect(service).toBeTruthy();
  });

  it('Testar função contarPrato()',()=>{
    let result = service.contarPrato();
    let expected = 35;
    
    expect( result ).toEqual(expected);
 });
  it('Testar função pratoGratis()', ()=>{
     let prato : Prato = {codprato: 5, descricao:"Peixe", preco: 10}
     let prato2 : Prato = {codprato: 5, descricao:"Peixe", preco: 0}
     let result = service.pratoGratis(prato);
     let expected = prato2;

     expect( result ).toEqual(expected);
  });
  it('Testar função descontoPrato()', ()=>{
    let prato : Prato = {codprato: 1, descricao: 'Carne', preco: 10}
    let result = service.descontoPrato(prato);
    let expected =8;

    expect ( result ).toEqual( expected);
  });
    
    
    




  

   

 
});
 


