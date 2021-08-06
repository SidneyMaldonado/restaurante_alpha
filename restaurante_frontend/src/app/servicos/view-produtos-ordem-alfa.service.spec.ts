import { TestBed } from '@angular/core/testing';

import { ViewProdutosOrdemAlfaService } from './view-produtos-ordem-alfa.service';

describe('ViewProdutosOrdemAlfaService', () => {
  let service: ViewProdutosOrdemAlfaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ViewProdutosOrdemAlfaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
