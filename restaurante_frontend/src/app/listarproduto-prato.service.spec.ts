import { TestBed } from '@angular/core/testing';

import { ListarprodutoPratoService } from './listarproduto-prato.service';

describe('ListarprodutoPratoService', () => {
  let service: ListarprodutoPratoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ListarprodutoPratoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
