export class Stage {
	public id: number;
    public name: string;
    constructor(name: string) {
        this.name = name;
        this.id = Math.floor(Math.random()*100000);
    }
}
