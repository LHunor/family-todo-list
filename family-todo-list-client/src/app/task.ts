import { Stage } from './stage';
import { StageService } from './stage.service';

export class Task {
	private stageService: StageService;
	public id: number = 0;
	public title: string = '';
	public description: string = '';
	// todo: change to stage object
	public stage: Stage;
}