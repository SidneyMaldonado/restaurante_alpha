import { HttpClientTestingModule } from '@angular/common/http/testing';
import { TestBed } from '@angular/core/testing';
import { Produto } from 'src/Produto';

import { ProdutoService } from './produto.service';

describe('ProdutoService', () => {
  let service: ProdutoService;

  beforeEach(() => {
    TestBed.configureTestingModule({

      imports: [HttpClientTestingModule]

    });
    service = TestBed.inject(ProdutoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

it ('testar contar produto', () =>{
     
    let result= service.contarProduto();
    let expected = 41;
    expect(result).toEqual(expected);
});

it('Testar desconto Produto', () => {
  

  let produto: Produto = {codigo:1, nome:"Agrotoxico", preco:17.90, quantidade:2.00}
  let result = service.descontoProduto( produto);
  let expected = 16.11;

  expect(result).toEqual(expected);
   ;
});
  
it('testar falta produto', () => {
        
     let produto: Produto = {codigo:1, nome:"Agrotoxico", preco:17.90, quantidade:2.00}
      let result = service.faltaProduto(produto);
      let expected = true;

      expect(result).toEqual(expected);
});


});
