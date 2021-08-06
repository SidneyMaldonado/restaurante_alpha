import { TestBed } from '@angular/core/testing';

import { ViewQtdPratosPedidoService } from './view-qtd-pratos-pedido.service';

describe('ViewQtdPratosPedidoService', () => {
  let service: ViewQtdPratosPedidoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ViewQtdPratosPedidoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
