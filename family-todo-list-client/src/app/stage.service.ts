import { Injectable } from '@angular/core';
import { Stage } from "./stage";
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class StageService {

  private stageUrl: string = 'http://localhost:8080/stages';

  constructor(private http: HttpClient) { }

  getStages(): Promise<Stage[]> {
    return this.http.get<Stage[]>(`${this.stageUrl}`).toPromise();
  }

  getStage(id: number): Promise<Stage> {
    return this.http.get<Stage>(`${this.stageUrl}/${id}`).toPromise();
  }

  createStage(stage: Stage): Promise<Stage> {
    return this.http.post<Stage>(`${this.stageUrl}`, stage).toPromise();
  }

  updateStage(stage: Stage): Promise<Stage> {
    return this.http.put<Stage>(`${this.stageUrl}/${stage.id}`, stage).toPromise();
  }

  deleteStage(id: number): Promise<Stage> {
    return this.http.delete<Stage>(`${this.stageUrl}/${id}`).toPromise();
  }
}