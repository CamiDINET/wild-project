import { Ingredient } from "./ingredient";

export interface Hop extends Ingredient {
    id:number,
    name: string,
    characterDescription: string,
    type:string,
    style: string,
}
