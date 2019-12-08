import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'stage-filter',
  templateUrl: './stage-filter.component.html',
  styleUrls: [ './stage-filter.component.css' ]
})
export class StageFilterComponent  {

  @Input('stage') selectedStage: string = '';
  public stages: string[] = [ 'New', 'In Progress', 'Canceled', 'Done' ];
  @Output() onChange = new EventEmitter<string>();

  constructor() { }

  onFilterChange(stage: string): void {
    this.selectedStage = stage;
    this.onChange.emit(stage);
  }

}