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

  it('Testar função Login testarLogin()', () => {
    let result = service.testarLogin("fulano", "65432");
    let expected = true;

    expect(result).toEqual(expected);
  });

  it('Usuário autorizado usuarioAutorizado()', () => {
    let expected = true;
    let result = service.usuarioAutorizado();

    expect(result).toEqual(expected);
  });

  it('Usuário não autorizado usuarioNaoAutorizado()', () => {
    let result = service.usuarioNaoAutorizado("beltrano");
    let expected = false;

    expect(result).toEqual(expected);
  });

});
