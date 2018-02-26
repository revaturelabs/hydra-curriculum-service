# hydra-curriculum-service

Performs CRUD operations on Curriculum beans. A curriculum bean is as follows (subject to change):

* `Curriculum`
	* `int currId`
	* `String name`
	* `List<Integer> skills`
	* `Boolean active`
	* `Boolean core`

The controller's root url is `api/v2/curriculum` can perform the following functions:

* `CurriculumCtrl`
	* `Object createCurriculum(@RequestBody CurriculumDTO in)`, via a POST to `/`
	* `Object retrieveCurriculum(@PathVariable("id") int ID)`, via a GET to `/{id}`
	* `Object updateCurriculum(@RequestBody CurriculumDTO in)`, via a PUT to `/`
	* `Object deleteCurriculum(@PathVariable("id") int ID)`, via DELETE to `/{id}`
	* `Object retrieveAllCurricula( @PathVariable("id") int ID )`, via a GET to `/`
	* `Object retrieveAllActiveCurricula()`, via a GET to `/active`
	* `Object retrieveAllCore()`, via GET to `/core`
	* `Object retrieveAllActiveCore()`, via a GET to `/activeCore`
	* `Object retrieveAllFocus()`, via a GET to `/focus`
	* `Object retrieveAllActiveFocus()`, via a GET to `activeFocus`