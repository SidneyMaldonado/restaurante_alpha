import { TestBed } from '@angular/core/testing';
import { ServicologinService } from './servicologin.service';
import { HttpClientTestingModule} from '@angular/common/http/testing'

describe('ServicologinService', () => {
  let service: ServicologinService;

  beforeEach(() => {
    TestBed.configureTestingModule({imports:[HttpClientTestingModule]});
    service = TestBed.inject(ServicologinService);
  });

  it('Deveria ser criado', () => {
    expect(service).toBeTruthy();
  });

  it('Testear funcao somar()', ()=> {
    let result = service.somar(5,7);
    let expected = 12;

     expect( result ).toEqual(expected);
  });

});
