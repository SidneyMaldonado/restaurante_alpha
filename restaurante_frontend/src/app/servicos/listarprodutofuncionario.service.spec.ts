import { TestBed } from '@angular/core/testing';

import { ListarprodutofuncionarioService } from './listarprodutofuncionario.service';

describe('ListarprodutofuncionarioService', () => {
  let service: ListarprodutofuncionarioService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ListarprodutofuncionarioService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
