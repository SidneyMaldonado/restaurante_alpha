import { TestBed } from '@angular/core/testing';

import { ViewSomaPagoClienteService } from './view-soma-pago-cliente.service';

describe('ViewSomaPagoClienteService', () => {
  let service: ViewSomaPagoClienteService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ViewSomaPagoClienteService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
