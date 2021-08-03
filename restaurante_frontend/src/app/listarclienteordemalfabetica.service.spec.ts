import { TestBed } from '@angular/core/testing';

import { ListarclienteordemalfabeticaService } from './listarclienteordemalfabetica.service';

describe('ListarclienteordemalfabeticaService', () => {
  let service: ListarclienteordemalfabeticaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ListarclienteordemalfabeticaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
