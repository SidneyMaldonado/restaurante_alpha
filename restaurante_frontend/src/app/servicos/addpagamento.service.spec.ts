import { HttpClientTestingModule } from '@angular/common/http/testing';
import { TestBed } from '@angular/core/testing';

import { AddpagamentoService } from './addpagamento.service';

describe('AddpagamentoService', () => {
  let service: AddpagamentoService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule]
    });
    service = TestBed.inject(AddpagamentoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
