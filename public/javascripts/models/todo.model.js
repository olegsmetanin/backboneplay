define(['jquery',
        'backbone' ,
        'underscore'], function($, Backbone, _) {


 // Todo Model
  // ----------

  // Our basic **Todo** model has `text`, `order`, and `done` attributes.
  var Todo = Backbone.Model.extend({

    // Default attributes for a todo item.
    defaults: function() {
      return {
        done:  false,
        order: 1
      };
    },

    // Toggle the `done` state of this todo item.
    toggle: function() {
      this.save({done: !this.get("done")});
    }

  });
   return Todo;
});