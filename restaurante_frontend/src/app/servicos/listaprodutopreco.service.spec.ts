import { TestBed } from '@angular/core/testing';

import { ListaprodutoprecoService } from './listaprodutopreco.service';

describe('ListaprodutoprecoService', () => {
  let service: ListaprodutoprecoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ListaprodutoprecoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
