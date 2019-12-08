import { Stage } from './stage';

export class Task {
	public id: number = 0;
	public title: string = '';
	public description: string = '';
	// todo: change to stage object
	public stage: Stage;
}