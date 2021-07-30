import { HttpClientTestingModule } from '@angular/common/http/testing';
import { TestBed } from '@angular/core/testing';
import { ClienteService } from './cliente.service';

describe('ClienteService', () => {
  let service: ClienteService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule]
    });
    service = TestBed.inject(ClienteService);
  });

  it('Deveria ser criado', () => {
    expect(service).toBeTruthy();
  });

});
