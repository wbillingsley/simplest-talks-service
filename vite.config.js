import { defineConfig } from "vite";
import scalaJSPlugin from "@scala-js/vite-plugin-scalajs";

export default defineConfig({
  plugins: [scalaJSPlugin({
    cwd: ".",
    projectID: "site",  
  })],
  
  base: '/simplest-talks-service/',
  publicDir: 'assets',

  server: {
    host: true
  }
});