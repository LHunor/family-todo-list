import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Stage } from '../stage';
import { StageService } from '../stage.service';

@Component({
  selector: 'stage-filter',
  templateUrl: './stage-filter.component.html',
  styleUrls: [ './stage-filter.component.css' ]
})
export class StageFilterComponent implements OnInit {

  @Input('stage') selectedStage: string = '';
  public stages: Stage[];
  @Output() onChange = new EventEmitter<string>();

  constructor(private stageService: StageService) { }

  async ngOnInit(): Promise<void> {
    this.stages = await this.stageService.getStages();
    console.log(this.stages);
  }

  onFilterChange(stage: string): void {
    this.selectedStage = stage;
    this.onChange.emit(stage);
  }

}