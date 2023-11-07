import { Ingredient } from "./ingredient";

export class Malt extends Ingredient {
    id!: number;
    name!: string;
    description!: string;
    style!: "BASE" | "TOURAILLÉ" | "CARAMEL" | "SPÉCIAL";
    maxUse!: number
}
