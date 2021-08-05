import { TestBed } from '@angular/core/testing';

import { ClientesatendidosService } from './clientesatendidos.service';

describe('ClientesatendidosService', () => {
  let service: ClientesatendidosService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ClientesatendidosService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
