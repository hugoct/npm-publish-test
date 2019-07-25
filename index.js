import React from "react";
import { NativeModules } from "react-native";

export default const show = () => NativeModules.MinhaLibToast.exibirToast("Teste NPM !!");