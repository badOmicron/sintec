import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DesplazamientoInventarioChartComponent } from './desplazamiento-inventario-chart.component';

describe('DesplazamientoInventarioChartComponent', () => {
  let component: DesplazamientoInventarioChartComponent;
  let fixture: ComponentFixture<DesplazamientoInventarioChartComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DesplazamientoInventarioChartComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DesplazamientoInventarioChartComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
