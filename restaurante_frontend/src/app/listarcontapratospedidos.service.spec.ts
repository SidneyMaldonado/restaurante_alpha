import { TestBed } from '@angular/core/testing';

import { ListarcontapratospedidosService } from './listarcontapratospedidos.service';

describe('ListarcontapratospedidosService', () => {
  let service: ListarcontapratospedidosService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ListarcontapratospedidosService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
