import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ReporteDesplazamientoInventarioComponent } from './reporte-desplazamiento-inventario.component';

describe('ReporteDesplazamientoInventarioComponent', () => {
  let component: ReporteDesplazamientoInventarioComponent;
  let fixture: ComponentFixture<ReporteDesplazamientoInventarioComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ReporteDesplazamientoInventarioComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ReporteDesplazamientoInventarioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
